from operator import index
from django.shortcuts import render
from flask import Flask, render_template 
app = Flask(__name__)


@app.route("/")
def homepage():
    return "hi"


@app.route("/play")
def play():
    return render_template ("index.html",number=3)

@app.route('/play/<num>')  
def play2(num):
    return render_template("index.html",number=int(num))


@app.route('/play/<num>/<color>')
def color(num, color):
    return render_template("index.html",number=int(num) ,color=color )    










if __name__ == "__main__":
    app.run(debug=True, port=9000)