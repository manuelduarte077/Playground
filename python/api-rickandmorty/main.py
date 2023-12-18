import requests
import json


# request simple get
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


get_request()