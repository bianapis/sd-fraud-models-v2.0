package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingUpdateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModelFraudModelSpecificationInstanceRecord
 */
public class BQTestingUpdateInputModelFraudModelSpecificationInstanceRecord   {
  private String fraudModelType = null;

  private BQTestingUpdateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment = null;

  private String fraudModelVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of behavior model (e.g. Decision tree, Bayesian Linear Regression, Logistic Regression, Neural Network)) 
   * @return fraudModelType
  **/

  public String getFraudModelType() {
    return fraudModelType;
  }

  public void setFraudModelType(String fraudModelType) {
    this.fraudModelType = fraudModelType;
  }


  /**
   * Get fraudModelDeployment
   * @return fraudModelDeployment
  **/

  public BQTestingUpdateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment getFraudModelDeployment() {
    return fraudModelDeployment;
  }

  public void setFraudModelDeployment(BQTestingUpdateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment) {
    this.fraudModelDeployment = fraudModelDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Release version of available model plus version history as appropriate 
   * @return fraudModelVersion
  **/

  public String getFraudModelVersion() {
    return fraudModelVersion;
  }

  public void setFraudModelVersion(String fraudModelVersion) {
    this.fraudModelVersion = fraudModelVersion;
  }


}

