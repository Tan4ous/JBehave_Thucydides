
Scenario: Looking up the definition of 'apple'
Given the user is on the http://qrcoder.ru/
When the user enter the word 'apple'
Then image not null

Scenario: Looking up the definition of 'pear'
Given the user is on the http://qrcoder.ru/
When the user enter the word 'pear'
Then image not null
