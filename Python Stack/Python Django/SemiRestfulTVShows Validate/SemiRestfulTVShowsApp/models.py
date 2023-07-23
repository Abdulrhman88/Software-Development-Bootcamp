from operator import mod
from django.db import models


class mangershow(models.Manager):
    def validator(self, postData):
        erors = {}
        if len(postData['title']) < 2:
            erors['title'] = 'tite should be at least 2 Charcters'
        if len(postData['network']) < 3:
            erors["network"] = "network  should be at least 3 characters"
        if len(postData['description']) < 10:
            erors["description"] = "description should be at least 10 characters" 
        return erors

    def editvalidator(self, postData):
        erors = {}
        if len(postData['title']) < 2:
            erors['title'] = 'tite should be at least 2 Charcters'
        if len(postData['network']) < 3:
            erors["network"] = "network  should be at least 3 characters"
        if len(postData['description']) < 10:
            erors["description"] = "description should be at least 10 characters" 
        return erors 



class Show(models.Model):
    title = models.CharField(max_length=255)
    network = models.CharField(max_length=255)
    release_date = models.DateTimeField()
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects=mangershow()

