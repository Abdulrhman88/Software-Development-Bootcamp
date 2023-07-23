from django.shortcuts import render, HttpResponse,redirect

from Dojoapp.models import dojos
from .models import *

def index(request):
    newDojo=dojos.objects.all()
    context={

        "newDojo" :newDojo,

        }
    return render(request,"index.html",context)

def createDojo(request):
  if request.method=="POST":
    newDojo=dojos.objects.create(
        name=request.POST["name"],
        city=request.POST["city"],
        state=request.POST["state"],
    )
    newDojo.save()
    return redirect('/')

def createNanja(request):
  if request.method=="POST":
    newnanjas=ninjas.objects.create(
        dojo_id=dojos.objects.get(id=int(request.POST['dojo_id'])),
        fname=request.POST["fname"],
        lname=request.POST["lname"],
    )
    newnanjas.save()
    return redirect("/")    