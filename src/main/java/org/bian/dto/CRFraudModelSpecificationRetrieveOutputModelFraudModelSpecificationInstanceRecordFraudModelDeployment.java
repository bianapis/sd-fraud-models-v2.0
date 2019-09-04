package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment
 */
public class CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment   {
  private String employeeBusinessUnitReference = null;

  private CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business units where the model is deployed and in use 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get fraudModelDeploymentConfiguration
   * @return fraudModelDeploymentConfiguration
  **/

  public CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration getFraudModelDeploymentConfiguration() {
    return fraudModelDeploymentConfiguration;
  }

  public void setFraudModelDeploymentConfiguration(CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration) {
    this.fraudModelDeploymentConfiguration = fraudModelDeploymentConfiguration;
  }


}

