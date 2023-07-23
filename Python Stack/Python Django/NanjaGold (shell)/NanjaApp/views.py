
from django.shortcuts import HttpResponse, render


from django.http import HttpResponse
from django.shortcuts import render , redirect 
import random
from datetime import datetime

def index(request):
    if not 'gold' in request.session:
        request.session['gold'] = 0
        request.session['activities'] = []

    return render(request,'index.html')

def process(request):
    chance = 100
    location = request.GET['location']


    
