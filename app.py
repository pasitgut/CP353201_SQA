from flask import Flask, jsonify
from flask_restful import Resource, Api, reqparse
from flasgger import Swagger, swag_from

app = Flask(__name__)

api = Api(app)

swagger = Swagger(app)

movie_portal_data = {
    "datenight": {
        'playlist_id': 'pl01',
        'playlist_name': 'datenight',
        'movie_lists': [
            'The Notebook',
            '50 First Dates',
            'A Walk to Remember'
        ]
    },
    "action": {
        'playlist_id': 'pl02',
        'playlist_name': 'action',
        'movie_lists': [
            'Die Hard',
            'Mad Max: Fury Road',
            'John Wick',
        ],
    },
    "comedy": {
        'playlist_id': 'pl03',
        'playlist_name': 'comedy',
        'movie_lists': [
            'Superbad',
            'Step Brothers',
            'The Hangover'
        ]
    },
}

next_playlist_id = 4


class MovieService(Resource):
    @swag_from({
        'responses': {
            200: {
                'description': 'A listo of all movie playlists',
                'schema': {
                    'type': 'array',
                    'items': {
                        'type': 'object',
                        'properties': {
                            'playlist_id': {'type': 'string', 'description': 'Unique ID of the playlist'},
                            'playlist_name': {'type': 'string', 'descrption': 'Name of the playlist'},
                            'movie_list': {'type': 'array', 'items': { 'type': 'string'}, 'description': 'List of movie in the playlist'}
                        }
                    }
                }
            }
        }
    })
    def get(self):
        return list(movie_portal_data.values()), 200
    
    @swag_from({
        'parameters': [
            {
                'name': 'body',
                'in': 'body',
                'required': True,
                'schema': {
                    'id': 'PlaylistInput',
                    'type': 'object',
                    'properties': {
                        'playlist_name': {'type': 'string', 'required': True, 'description': 'ชื่อของเพลย์ลิสต์ใหม่'},
                        'movie_list': {'type': 'array', 'items': {'type': 'string'}, 'required': True, 'description': 'รายการภาพยนตร์ในเพลย์ลิสต์'}
                    },
                    'example': {
                        'playlist_name': 'Horror Classics',
                        'movie_list': ['The Exorcist', 'Psycho', 'Alien']
                    }
                }
            }
        ],
        'responses': {
            201: {
                'description': 'Playlist สร้างสำเร็จ',
                'schema': {
                    'type': 'object',
                    'properties': {
                        'message': {'type': 'string'},
                        'playlist': {
                            'type': 'object',
                            'properties': {
                                'playlist_id': {'type': 'string'},
                                'playlist_name': {'type': 'string'},
                                'movie_list': {'type': 'array', 'items': {'type': 'string'}}
                            }
                        }
                    }
                }
            },
            400: {
                'description': 'ข้อมูลไม่ถูกต้อง หรือเพลย์ลิสต์มีอยู่แล้ว'
            }
        },
        'summary': 'เพิ่มเพลย์ลิสต์ภาพยนตร์ใหม่'
    })
    def post(self):
        parser = reqparse.RequestParser()
        parser.add_argument('playlist_name', type=str, required=True, help="Playlist name must not be empty"),
        parser.add_argument('movie_list', type=list, location='json', required=True, help="Movie list must not be empty")

        args = parser.parse_args(strict=True)

        playlist_name_key = args['playlist_name'].lower().replace("", "_")
        if playlist_name_key in movie_portal_data:
            return { 'message': f"Playlist '{args['playlist_name']}' มีอยู่แล้ว"}, 400
        global next_playlist_id
        new_playlist = {
            'playlist_id': f"pl${next_playlist_id}",
            'playlist_name': args['playlist_name'],
            'movie_list': args['movie_list']
        }

        movie_portal_data[playlist_name_key] = new_playlist
        next_playlist_id += 1
        return { 'message': 'Added playlist success', 'playlist': new_playlist}, 201

api.add_resource(MovieService, '/playlists')

if __name__ == '__main__':
    app.run(debug=True, port=5000)