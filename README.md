# <h1>LinkedinScraper</h1>
<h2>By Weston Jackson
westonjackson2106@gmail.com</h2>

LinkedinScraper allows a user to input candidate key words and receive an excel sheet of candidates, linkedin profiles, and current job titles. It bypases the Linkedin security measures by searching through google, and bypasses google security measures by making requests at random intervals between 1-15 seconds. When using the GUI, a user can also specify the number of pages of Google to search for candidates.


<h3>Required External Libraries:</h3>
<p>htmlunit-2.16</p>
<p>selenium-2.45.0</p>

<h3>Classes:</h3>
<ul>
<li>ScraperGUI.java - UI for the Linkedin scraper, contains the main method. Has subclass for the actionlistener submit button.</li>
<li>Scraper.java - Contains the bulk of the program, parses through google search results to get linkedin profiles of candidates.</li>
<li>Candidate.java - Candidate object contains name, url, and job.</li>
</ul>
