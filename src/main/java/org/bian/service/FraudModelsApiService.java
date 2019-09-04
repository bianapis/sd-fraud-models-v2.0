/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudModelsApiService {

	SDFraudModelsActivateOutputModel activate(SDFraudModelsActivateInputModel request);
	
	BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request);
	
	SDFraudModelsConfigureOutputModel configure(String sdReferenceId, SDFraudModelsConfigureInputModel request);
	
	CRFraudModelSpecificationCreateOutputModel create(String sdReferenceId, CRFraudModelSpecificationCreateInputModel request);
	
	BQFunctionalRequirementsExchangeOutputModel exchangeFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsExchangeInputModel request);
	
	BQTestingExchangeOutputModel exchangeTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingExchangeInputModel request);
	
	BQProductionExecuteOutputModel executeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExecuteInputModel request);
	
	CRFraudModelSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFraudModelSpecificationExecuteInputModel request);
	
	SDFraudModelsFeedbackOutputModel feedback(String sdReferenceId, SDFraudModelsFeedbackInputModel request);
	
	BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request);
	
	BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request);
	
	CRFraudModelSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFraudModelSpecificationRequestInputModel request);
	
	BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRFraudModelSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFraudModelsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request);
	
	BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request);
	
}
