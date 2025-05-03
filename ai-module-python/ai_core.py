import sys
import json

def generate_trip(preferences):
    nature = preferences.get("nature", False)
    cities = preferences.get("cities", False)
    activity = preferences.get("activity", False)

    recommendations = []

    if nature:
        recommendations.append("Explore Banff National Park in Canada 🌲")
    if cities:
        recommendations.append("Visit Tokyo and enjoy its vibrant urban life 🏙️")
    if activity:
        recommendations.append("Go hiking in the Swiss Alps ⛰️")

    return {
        "trip_plan": recommendations,
        "summary": "Trip generated based on your preferences!"
    }

def main():
    input_data = sys.stdin.read()
    prefs = json.loads(input_data)
    result = generate_trip(prefs)
    print(json.dumps(result))

if __name__ == "__main__":
    main()
