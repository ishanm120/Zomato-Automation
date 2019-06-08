$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Launch Zomato application",
  "description": "",
  "id": "launch-zomato-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1007386,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Open Application",
  "description": "",
  "id": "launch-zomato-application;open-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify app is laucnhed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.launchApplication()"
});
formatter.result({
  "duration": 98575425,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.appLauncedSuccessfully()"
});
formatter.result({
  "duration": 71741,
  "status": "passed"
});
formatter.after({
  "duration": 535032,
  "status": "passed"
});
formatter.before({
  "duration": 1275091,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Open Application again",
  "description": "",
  "id": "launch-zomato-application;open-application-again",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Verify app is laucnhed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.launchApplication()"
});
formatter.result({
  "duration": 147257,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.appLauncedSuccessfully()"
});
formatter.result({
  "duration": 148012,
  "status": "passed"
});
formatter.after({
  "duration": 97039,
  "status": "passed"
});
});