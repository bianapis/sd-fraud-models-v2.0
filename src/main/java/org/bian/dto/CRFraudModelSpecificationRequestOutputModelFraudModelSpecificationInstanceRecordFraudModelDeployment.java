package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment
 */
public class CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeployment   {
  private String employeeBusinessUnitReference = null;

  private CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration = null;


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

  public CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration getFraudModelDeploymentConfiguration() {
    return fraudModelDeploymentConfiguration;
  }

  public void setFraudModelDeploymentConfiguration(CRFraudModelSpecificationRequestOutputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration) {
    this.fraudModelDeploymentConfiguration = fraudModelDeploymentConfiguration;
  }


}

