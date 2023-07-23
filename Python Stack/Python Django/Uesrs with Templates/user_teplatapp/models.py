import email
from django.db import models
    
class Movie(models.Model):
    fname = models.CharField(max_length=45)
    lname =models.CharField(max_length=45)
    email = models.CharField(max_length=45)
    age = models.IntegerField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
