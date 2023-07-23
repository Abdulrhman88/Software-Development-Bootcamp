from unicodedata import name
from xml.etree.ElementTree import Comment
from django.shortcuts import render

from django.shortcuts import render


def index(request):
    return render(request,"index.html")
        
def create(request):
    name = request.POST['name']
    location=request.POST['location']
    favorite=request.POST['favorite']
    Comment=request.POST['comment']

    context = {
    	#"name_on_template" : name_from_form,
    	"n1_name":name,
        "n2_location":location,
        "n3_favorite": favorite,
        "n4_comment":Comment,
    }
    return render(request,"res.html",context)