from datetime import datetime
from django.shortcuts import render ,HttpResponse
from time import gmtime, strftime

def index(request):
    today = datetime.now()
    context = {
        'Date': today.strftime('%B %d, %Y'),
        'Time': today.strftime('%H:%M %p')
    }
    return render(request,'index.html', context)