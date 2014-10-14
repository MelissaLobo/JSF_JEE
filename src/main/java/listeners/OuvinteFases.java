package listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

@SuppressWarnings("serial")
public class OuvinteFases implements PhaseListener {

	public void afterPhase(PhaseEvent event) {
		
	}

	public void beforePhase(PhaseEvent event) {
		
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
