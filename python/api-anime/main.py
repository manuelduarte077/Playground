import requests

URL = "https://api.jikan.moe/v4/top/anime"


def fetch_data():
    data = requests.get(URL)

    if data.status_code == 200:
        data = data.json()

        for e in data["data"]:
            print(e["title"])
    else:
        print("Error")


fetch_data()

