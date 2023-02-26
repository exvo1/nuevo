package net.sf.l2j.gameserver.model.actor.instance;

import net.sf.l2j.gameserver.model.actor.PcPolymorph;
import net.sf.l2j.gameserver.model.actor.template.NpcTemplate;

import Custom.CustomConfig;
import Customs.data.CharacterKillingManager;

/**
 * @author Williams
 *
 */
public class TopPvPMonument extends PcPolymorph
{
	public TopPvPMonument(int objectId, NpcTemplate template)
	{
		super(objectId, template);
	}
	
	@Override
	public void onSpawn()
	{
		super.onSpawn();
		
		if (CustomConfig.CKM_ENABLED)
			CharacterKillingManager.getInstance().addPvPMorphListener(this);
	}
	
	@Override
	public void deleteMe()
	{
		super.deleteMe();
		
		if (CustomConfig.CKM_ENABLED)
			CharacterKillingManager.getInstance().removePvPMorphListener(this);
	}
}