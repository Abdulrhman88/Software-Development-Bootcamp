from flask import Flask
skill = Flask(__name__)


@skill.route("/")
def homepage():
    return "Hello World"


@skill.route("/Dojo")
def about():
    return "Dojo"


@skill.route("/say/<name>")
def say_name(name):
    return f" Hi {name}"

@skill.route("/repeat/<int:repeat_times>/<msg>")
def repeat(repeat_times,msg):
    ms = ""
    for i in range(repeat_times):
        ms += msg + "<br>"
    return ms

@skill.errorhandler(404)
def eror(e):
   return("Sorry! No response. Try again.") 








if __name__ == "__main__":
    skill.run(debug=True, port=9000)
