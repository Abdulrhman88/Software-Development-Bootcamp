from django.urls import path     
from . import views
urlpatterns = [
    
    path('', views.index),
    path('AddNinja', views.createNanja),
    path('AddDojo', views.createDojo)		   
]