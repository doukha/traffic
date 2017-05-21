import requests


print '********** before ***********'

url = 'http://localhost:8080/traffic/metros/1'
response = requests.get(url)
if response.content == "normal":
    print 'lampe verte'
elif response.content == "perturbe":
    print 'lampe orange'

print '********** after *********** %'
