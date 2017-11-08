## potato-survey Java Web App

### G4C Project from November 7th

**Git Markup from** (https://help.github.com/articles/basic-writing-and-formatting-syntax/)

An MVC Controller Sample in Spring Boot:

* Initial screen when hitting localhost does not have a Controller, so it simply sends the user to a template HTML page
* Note Go Back Links will send you to the previous screen using an anchor aref to where you navigated from
* Off the HomePage, the Link starts some Controller logic
* Sends you to /twice-baked.html, which has some Mustache substitution for an adjective and degree for which temperature you should cook to
* The survey ModelAndView will handle survey results, which calls into another class SurveyResults to pull additional calcultated information
* The SurveyRecults class (under models) can provide: registered votes for each potato, returned votes for each potato, and can be invoked to reset all potatoe votes

**Additional Explanation forthcoming 11/8**
