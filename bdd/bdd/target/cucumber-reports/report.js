$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/test/bdd/searcchGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "search Ducks in google and verify result",
  "description": "This fature file will verify when user search with ducks it wll search only for ducks and show respective search page.",
  "id": "search-ducks-in-google-and-verify-result",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "verify search results displayed correctly on google search page",
  "description": "",
  "id": "search-ducks-in-google-and-verify-result;verify-search-results-displayed-correctly-on-google-search-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open an browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user search in google",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify result page shows correct result",
  "keyword": "Then "
});
formatter.match({
  "location": "searchGoogleStepDef.open_an_browser()"
});
formatter.result({
  "duration": 13645395352,
  "status": "passed"
});
formatter.match({
  "location": "searchGoogleStepDef.user_search_in_google()"
});
formatter.result({
  "duration": 2915547839,
  "status": "passed"
});
formatter.match({
  "location": "searchGoogleStepDef.verify_result_page_shows_correct_result()"
});
formatter.result({
  "duration": 1720667160,
  "status": "passed"
});
});