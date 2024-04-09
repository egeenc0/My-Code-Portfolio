from bs4 import BeautifulSoup
import requests
import re
import lxml

url = ('https://www.ilacabak.com/aralist.php?Id=L')

page = requests.get(url)

soup = BeautifulSoup(page.text, 'lxml')

first_price = soup.find_all('font', {'color':'green'})

numbers = re.findall(r'\d+(?:,\d+)*(?:\.\d+)?', str(first_price))

print(numbers)