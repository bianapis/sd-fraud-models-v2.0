package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceAnalysis
 */
public class BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceAnalysis   {
  private String functionalRequirementsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return functionalRequirementsInstanceAnalysisReference
  **/

  public String getFunctionalRequirementsInstanceAnalysisReference() {
    return functionalRequirementsInstanceAnalysisReference;
  }

  public void setFunctionalRequirementsInstanceAnalysisReference(String functionalRequirementsInstanceAnalysisReference) {
    this.functionalRequirementsInstanceAnalysisReference = functionalRequirementsInstanceAnalysisReference;
  }


}

