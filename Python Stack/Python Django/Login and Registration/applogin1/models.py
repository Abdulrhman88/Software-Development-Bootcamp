import bcrypt
from django.db import models
import re


class UserMangaer(models.Manager):
    def validation(self, postData):
        errors = {}
        if len(postData['fname']) < 2:
            errors['fname'] = 'fisrt name  should be at least 2 Charcters'
        if len(postData['lname']) < 2:
            errors["lname"] = "last name  should be at least 3 characters"

        EMAIL_REGEX = re.compile(
            r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if not EMAIL_REGEX.match(postData['email']):
            errors["email"] = "email is not vaild "
        
        else:
            try:
                user:User.objects.get(email__iexact=postData['email'])
            except:
                pass    

        if (postData['password']) != postData['confirm_password']:
            errors["password"] = "password not match"

        if len(postData['password']) < 8:
            errors["password"] = "password should be at least 8 characters"
        return errors


    def login_validation(self,postData):
        errors = {}

        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if not EMAIL_REGEX.match(postData['email']):
            errors['email'] = "Email is not valid"
        else:
            try:
                user = User.objects.get(email__iexact=postData['email'])
                if not bcrypt.checkpw(postData['password'].encode(),user.password.encode()):
                    errors['login'] = "Email or Password is incorrect !"
            except:
                errors['login'] = "Email or Password is incorrect !"
        
        return errors


class User (models.Model):
    fname = models.CharField(max_length=255)
    lname = models.CharField(max_length=255)
    email = models.CharField(max_length=255)
    password = models.CharField(max_length=255)
    objects=UserMangaer()
    
