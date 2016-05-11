@broken @test @staging @live

Feature: Browse doifinder, uidfinder, articlefinder, abstractpagefinder, pdffinder

Scenario Outline: As a user I want to browse all finders in labananimal.com
Given I am on labananimal.com
When  I navigate to finder "<finder>" for doi "<doi>"
Then  I should see the laban article "<article>"

Examples:

| finder             | doi                  | article                                     |
| doifinder          | 10.1038/laban0109-16 | laban/journal/v38/n1/full/laban0109-16.html |
| uidfinder          | 10.1038/laban0109-24 | laban/journal/v38/n1/full/laban0109-24.html |
| articlefinder      | 10.1038/laban0209-55 | laban/journal/v38/n2/full/laban0209-55.html |
| abstractpagefinder | 10.1038/laban0209-61 | laban/journal/v38/n2/abs/laban0209-61.html  |
| pdffinder          | 10.1038/laban0209-39 | laban/journal/v38/n2/pdf/laban0209-39.pdf   |