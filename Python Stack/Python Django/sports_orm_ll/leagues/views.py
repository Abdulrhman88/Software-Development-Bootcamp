from unicodedata import name
from django.shortcuts import render, redirect
from .models import League, Team, Player

from . import team_maker
import leagues

def index(request):
	context = {
		"leagues": League.objects.all(),
		"teams": Team.objects.all(),
		"players": Player.objects.all(),
		'teams_in_atlantic_soccer':Team.objects.filter(league__name="Atlantic Soccer Conference"), 
		'players_on_boston':Player.objects.filter(curr_team__location="Boston", curr_team__team_name="Penguins"),
		'players_in_icbc':Player.objects.filter(curr_team__league__name="International Collegiate Baseball Conference"), 
		'players_in_acaf_with_lname_lopez':Player.objects.filter(curr_team__league__name="American Conference of Amateur Football", last_name="Lopez"), 
		'football_players':Player.objects.filter(curr_team__league__sport="Football"), 
		'teams_with_curr_player_sophia':Team.objects.filter(curr_players__first_name="Sophia"),
		'leagues_with_curr_player_sophia':League.objects.filter(teams__curr_players__first_name="Sophia"),
		'players_lname_flores_not_with_wr':Player.objects.filter(last_name="Flores").exclude(curr_team__location="Washington" , curr_team__team_name="Roughriders"), 
		'manitoba_tiger_cats_players':Player.objects.filter(all_teams__location="Manitoba" , all_teams__team_name="Tiger-Cats"), 
		'players_not_curr_with_wv':Player.objects.filter(all_teams__location="Wichita" , all_teams__team_name="Vikings").exclude(curr_team__location="Wichita" , curr_team__team_name="Vikings"), 
		'jacob_gray_teams':Team.objects.filter(all_players__first_name="Jacob", all_players__last_name="Gray").exclude(team_name="Colts") , 
		'joshua_in_atlantic':Player.objects.filter(first_name="Joshua",all_teams__league__name="Atlantic Federation of Amateur Baseball Players"),
	}
	return render(request, "leagues/index.html", context)



def make_data(request):
	team_maker.gen_leagues(10)
	team_maker.gen_teams(50)
	team_maker.gen_players(200)

	return redirect("index")