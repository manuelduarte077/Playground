import requests
import json


# request simple get character 2
def get_request():
    url = 'https://rickandmortyapi.com/api/character/2'
    r = requests.get(url)
    response = r.json()


    status = response['status']
    print(status)

    i = 1

    while i < 11:
        url = 'https://rickandmortyapi.com/api/character/' + format(i)
        r = requests.get(url)
        j = r.json()

        name = j['name']
        status = j['status']

        print('El personaje ' + name + ' esta ' + status)
        i += 1


def get_request_episode():
    url = 'https://rickandmortyapi.com/api/episode/1'
    r = requests.get(url)
    response = r.json()

    name = response['name']
    print(name)

    i = 1

    while i < 21:
        url = 'https://rickandmortyapi.com/api/episode/' + format(i)
        r = requests.get(url)
        j = r.json()

        name = j['name']

        print('El episodio ' + name + ' es el ' + format(i))
        i += 1


get_request()