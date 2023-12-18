import requests

if __name__ == '__main__':
    url = 'https://www.getnerdify.com'
    response = requests.get(url)

    if response.status_code == 200:
        print(response.content)
        content = response.content

        file = open('index.html', 'wb')
        file.write(content)
        file.close()