package org.gastnet.individualmicro.command.handler;

import lombok.extern.slf4j.Slf4j;
import org.gnet.common.command.CreateIndividualCommand;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IndividualCommandHandler {
	
//	@Autowired
//	private EventBus eventBus;
//
//	@Autowired
//	private IndividualService individualService;

//	@CommandHandler
	protected void on(CreateIndividualCommand createIndividualCommand) {
//		try {
//			log.info("CreateIndividualCommand called");
//			Individual individual = SagaUtils.convertToIndividualEntity(createIndividualCommand.individual);
//			individual.setUserId(createIndividualCommand.userId);
//			individualService.save(individual);
//			eventBus.publish(GenericEventMessage.asEventMessage(new IndividualCreatedEvent(createIndividualCommand.userId)));
//		} catch (Exception e) {
//			log.error("Error at CreateIndividualCommand handler : " + e.getMessage());
//		}
	}
		
}
