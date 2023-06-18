$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/featureScopes.feature");
formatter.feature({
  "name": "Validate PwCDigital",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Column verification of Homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "name": "I am viewing the \"\u003cPage-name\u003e\" page",
  "keyword": "When "
});
formatter.step({
  "name": "I am presented with \"\u003cColNum\u003e\" columns of articles",
  "keyword": "Then "
});
formatter.step({
  "name": "The \"left\" column is displaying \"\u003cLeftColumnArticles\u003e\" articles",
  "keyword": "And "
});
formatter.step({
  "name": "The \"middle\" column is displaying \"\u003cMiddleColumnArticles\u003e\" articles",
  "keyword": "And "
});
formatter.step({
  "name": "The \"right\" column is displaying \"\u003cRightColumnArticles\u003e\" articles",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Page-name",
        "ColNum",
        "LeftColumnArticles",
        "MiddleColumnArticles",
        "RightColumnArticles"
      ]
    },
    {
      "cells": [
        "Home",
        "3",
        "2",
        "1",
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Column verification of Homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStepDefinations.UserIsInsideHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am viewing the \"Home\" page",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefinations.IAmViewingThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with \"3\" columns of articles",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinations.iAmPresentedWithColumnsOfArticles(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \"left\" column is displaying \"2\" articles",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDefinations.the_column_is_displaying_articles(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \"middle\" column is displaying \"1\" articles",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDefinations.the_column_is_displaying_articles(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \"right\" column is displaying \"4\" articles",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDefinations.the_column_is_displaying_articles(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Subscription fields validations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "name": "I am viewing the \"\u003cPage-name\u003e\" page",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the Subscribe navigation link",
  "keyword": "When "
});
formatter.step({
  "name": "I am taken to the Subscribe page",
  "keyword": "Then "
});
formatter.step({
  "name": "I am presented with the below fields",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Field",
        "Required",
        "Type"
      ]
    },
    {
      "cells": [
        "First Name",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Last Name",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Organisation",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Business Email Address",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Job Title",
        "true",
        "dropdown"
      ]
    },
    {
      "cells": [
        "State",
        "true",
        "dropdown"
      ]
    },
    {
      "cells": [
        "Countries or regions",
        "true",
        "dropdown"
      ]
    }
  ]
});
formatter.step({
  "name": "I will need to complete Google reCAPTCHA before I can complete my request",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Page-name"
      ]
    },
    {
      "cells": [
        "Home"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Subscription fields validations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStepDefinations.UserIsInsideHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am viewing the \"Home\" page",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefinations.IAmViewingThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Subscribe navigation link",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefinations.iClickOnTheSubscribeNavigationLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the Subscribe page",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscribeStepDefination.iAmTakenToTheSubscribePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with the below fields",
  "rows": [
    {
      "cells": [
        "Field",
        "Required",
        "Type"
      ]
    },
    {
      "cells": [
        "First Name",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Last Name",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Organisation",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Business Email Address",
        "true",
        "text"
      ]
    },
    {
      "cells": [
        "Job Title",
        "true",
        "dropdown"
      ]
    },
    {
      "cells": [
        "State",
        "true",
        "dropdown"
      ]
    },
    {
      "cells": [
        "Countries or regions",
        "true",
        "dropdown"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SubscribeStepDefination.iAmPresentedWithTheBelowFields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will need to complete Google reCAPTCHA before I can complete my request",
  "keyword": "And "
});
formatter.match({
  "location": "SubscribeStepDefination.iWillNeedToCompleteGoogleReCAPTCHABeforeICanCompleteMyRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search Result verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on the Magnifying glass icon to perform a search",
  "keyword": "When "
});
formatter.step({
  "name": "I enter the text \"\u003cTextToEnter\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I submit the search",
  "keyword": "And "
});
formatter.step({
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.step({
  "name": "I am presented with at least \"\u003cMinNoResults\u003e\" search result",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TextToEnter",
        "MinNoResults"
      ]
    },
    {
      "cells": [
        "Single page applications",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search Result verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStepDefinations.UserIsInsideHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Magnifying glass icon to perform a search",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefinations.iClickOnTheMagnifyingGlassIconToPerformASearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the text \"Single page applications\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDefinations.iEnterTheTextSinglePageApplications(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the search",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDefinations.iSubmitTheSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinations.iAmTakenToTheSearchResultsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with at least \"1\" search result",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinations.iAmPresentedWithAtLeastSearchResult(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});