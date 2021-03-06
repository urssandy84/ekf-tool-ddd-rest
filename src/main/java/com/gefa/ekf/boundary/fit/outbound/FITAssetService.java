package com.gefa.ekf.boundary.fit.outbound;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.gefa.ekf.domain.events.AssetCreatedEvent;

@ApplicationScoped
public class FITAssetService {

	@Inject
	private FITAssetServiceAdapter fitAssetServiceAdapter;

	public void createAsset(AssetCreatedEvent assetCreatedEvent) {
		fitAssetServiceAdapter.createAsset(assetCreatedEvent);
	}

	public void updateAsset(AssetCreatedEvent assetCreatedEvent) {
		fitAssetServiceAdapter.updateAsset(assetCreatedEvent);
	}

}
