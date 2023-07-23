from django.db import models

class dojos (models.Model):
    
    name=models.CharField(max_length=255)
    city=models.CharField(max_length=255)
    state=models.CharField(max_length=2)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    

class ninjas(models.Model):
    dojo_id = models.ForeignKey(dojos,related_name="ninjas",on_delete=models.CASCADE)
    fname=models.CharField(max_length=255)
    lname=models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

