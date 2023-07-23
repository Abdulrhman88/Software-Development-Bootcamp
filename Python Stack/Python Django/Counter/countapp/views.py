from django.shortcuts import render ,redirect

def index(request):
    if 'x' in request.session:
        print('x exists!')
        request.session['x']+=1
    else:
        print("x 'x' does NOT exist")
        request.session['x'] = 0

    return render(request, "index.html")

def _del(request):
    del request.session['x']
    return redirect('/')
