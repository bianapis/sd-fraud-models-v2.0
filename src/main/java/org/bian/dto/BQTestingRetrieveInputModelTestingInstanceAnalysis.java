package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveInputModelTestingInstanceAnalysis
 */
public class BQTestingRetrieveInputModelTestingInstanceAnalysis   {
  private String testingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return testingInstanceAnalysisReference
  **/

  public String getTestingInstanceAnalysisReference() {
    return testingInstanceAnalysisReference;
  }

  public void setTestingInstanceAnalysisReference(String testingInstanceAnalysisReference) {
    this.testingInstanceAnalysisReference = testingInstanceAnalysisReference;
  }


}

