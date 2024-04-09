from bs4 import BeautifulSoup

import requests

import lxml

url = ('https://www.ilacabak.com/')

page = requests.get(url)

soup = BeautifulSoup(page.text, 'lxml')

print(soup.find_all('div',{'class':'listefiyat'}))