package fr.alma.website.plugin;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

public class SiteAdapter implements Adapter {

	@Override
	public void notifyChanged(Notification notification) {
		System.out.format("Ancienne valeur: %s, Nouvelle valeur: %s \n", notification.getOldStringValue(),
				notification.getNewStringValue());
	}

	@Override
	public Notifier getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAdapterForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}

}
