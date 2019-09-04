/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudModelsApiServiceImpl implements FraudModelsApiService {

	public SDFraudModelsActivateOutputModel activate(SDFraudModelsActivateInputModel request){
		return JsonReader.read("activate-SDFraudModelsActivateOutputModel.json",new TypeReference<SDFraudModelsActivateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request){
		return JsonReader.read("capture-BQFunctionalRequirementsCaptureOutputModel.json",new TypeReference<BQFunctionalRequirementsCaptureOutputModel>(){});
	}
	
	public SDFraudModelsConfigureOutputModel configure(String sdReferenceId, SDFraudModelsConfigureInputModel request){
		return JsonReader.read("configure-SDFraudModelsConfigureOutputModel.json",new TypeReference<SDFraudModelsConfigureOutputModel>(){});
	}
	
	public CRFraudModelSpecificationCreateOutputModel create(String sdReferenceId, CRFraudModelSpecificationCreateInputModel request){
		return JsonReader.read("create-CRFraudModelSpecificationCreateOutputModel.json",new TypeReference<CRFraudModelSpecificationCreateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsExchangeOutputModel exchangeFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsExchangeInputModel request){
		return JsonReader.read("exchange-BQFunctionalRequirementsExchangeOutputModel.json",new TypeReference<BQFunctionalRequirementsExchangeOutputModel>(){});
	}
	
	public BQTestingExchangeOutputModel exchangeTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingExchangeInputModel request){
		return JsonReader.read("exchange-BQTestingExchangeOutputModel.json",new TypeReference<BQTestingExchangeOutputModel>(){});
	}
	
	public BQProductionExecuteOutputModel executeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExecuteInputModel request){
		return JsonReader.read("execute-BQProductionExecuteOutputModel.json",new TypeReference<BQProductionExecuteOutputModel>(){});
	}
	
	public CRFraudModelSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFraudModelSpecificationExecuteInputModel request){
		return JsonReader.read("execute-CRFraudModelSpecificationExecuteOutputModel.json",new TypeReference<CRFraudModelSpecificationExecuteOutputModel>(){});
	}
	
	public SDFraudModelsFeedbackOutputModel feedback(String sdReferenceId, SDFraudModelsFeedbackInputModel request){
		return JsonReader.read("feedback-SDFraudModelsFeedbackOutputModel.json",new TypeReference<SDFraudModelsFeedbackOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request){
		return JsonReader.read("request-BQFunctionalRequirementsRequestOutputModel.json",new TypeReference<BQFunctionalRequirementsRequestOutputModel>(){});
	}
	
	public BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request){
		return JsonReader.read("request-BQProductionRequestOutputModel.json",new TypeReference<BQProductionRequestOutputModel>(){});
	}
	
	public CRFraudModelSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFraudModelSpecificationRequestInputModel request){
		return JsonReader.read("request-CRFraudModelSpecificationRequestOutputModel.json",new TypeReference<CRFraudModelSpecificationRequestOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalRequirementsRetrieveOutputModel.json",new TypeReference<BQFunctionalRequirementsRetrieveOutputModel>(){});
	}
	
	public BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRetrieveOutputModel.json",new TypeReference<BQProductionRetrieveOutputModel>(){});
	}
	
	public BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTestingRetrieveOutputModel.json",new TypeReference<BQTestingRetrieveOutputModel>(){});
	}
	
	public CRFraudModelSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFraudModelSpecificationRetrieveOutputModel.json",new TypeReference<CRFraudModelSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDFraudModelsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFraudModelsRetrieveOutputModel.json",new TypeReference<SDFraudModelsRetrieveOutputModel>(){});
	}
	
	public BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request){
		return JsonReader.read("update-BQFunctionalRequirementsUpdateOutputModel.json",new TypeReference<BQFunctionalRequirementsUpdateOutputModel>(){});
	}
	
	public BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request){
		return JsonReader.read("update-BQTestingUpdateOutputModel.json",new TypeReference<BQTestingUpdateOutputModel>(){});
	}
	
}
