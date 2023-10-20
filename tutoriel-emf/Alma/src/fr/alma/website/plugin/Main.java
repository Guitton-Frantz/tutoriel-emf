package fr.alma.website.plugin;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.alma.web.model.webmodel.Folder;
import fr.alma.web.model.webmodel.Site;
import fr.alma.web.model.webmodel.WebmodelFactory;
import fr.alma.web.model.webmodel.WebmodelPackage;

public class Main {
	public static void main(String[] args) {
		WebmodelPackage wPackage = WebmodelPackage.eINSTANCE;
		WebmodelFactory factory = wPackage.getWebmodelFactory();

		Site site = factory.createSite();
		site.eAdapters().add(new SiteAdapter());
		site.setTitle("Alma website");

		Folder root = factory.createFolder();
		root.setName("root");

		site.getFolders().add(root);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("webmodel", new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI("alma.webmodel");
		Resource resource = rs.createResource(uri);

		site.getFolders().add(root);
		resource.getContents().add(site);

		resource.getContents().add(site);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Resource.Factory.Registry reg2 = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m2 = reg2.getExtensionToFactoryMap();
		m2.put("webmodel", new XMIResourceFactoryImpl());

		ResourceSet rs2 = new ResourceSetImpl();
		URI uri2 = URI.createFileURI("alma.webmodel");
		Resource resource2 = rs2.getResource(uri2, true);  
		Site loadedSite = (Site) resource2.getContents().get(0);


	}
}
