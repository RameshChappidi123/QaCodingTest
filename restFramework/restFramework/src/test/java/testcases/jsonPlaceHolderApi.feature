Feature: Verify get call for json place holder
  This fature file will verify different scenarios for get call for json place holder api


##########################positive scenarios##############################
    Scenario Outline: Verify required values present in response
    Given verify after performing get call
    Then I verify value displayed as <key> for key <value> is correct

    Examples: 
      |code |key|value   |
      | 200 | "userId"   |"1"|
      | 200 | "id"   |"1"|
      
    
    Scenario Outline: Verify response code
    Given verify after performing get call
    Then I verify the response code is <code> in step
    Examples: 
     |code |
     | 200 |

##########################Negative scenarios##############################     
    
    Scenario Outline: Verify error code for incorrect endpoint
    Given verify error code after performing get call for incorrect end point
    Then I verify the response code is <code> in step
    Examples: 
     |code |
     | 404 |
     
    Scenario Outline: Verify response body is empty when for query parameter is given outof avaialble records
    Given verify error code after performing get call for out of range end point
    Then I verify the response code is <code> in step
    Then verify response body is empty
    Examples: 
     |code |
     | 404 |
	
