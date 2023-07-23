from multiprocessing import context
from django.shortcuts import render ,redirect
from .models import *

def index(request):
    users=Movie.objects.all()
    context={
        'users':users
    }
    return render (request,'index.html',context)


def create(request):
 if request.method =='POST':
      newUSer=Movie.objects.create(
        fname=request.POST['fname'],
        lname=request.POST['lname'],
        email=request.POST['email'],
        age=request.POST['age'],
      )
      newUSer.save()
      return redirect('/')