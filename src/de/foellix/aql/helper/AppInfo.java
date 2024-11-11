package de.foellix.aql.helper;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class AppInfo {
	private File apkFile;
	private String filename;
	private ManifestInfo manifestInfo;

	public AppInfo(File apkFile) {
		this.apkFile = apkFile;
		this.filename = FilenameUtils.getBaseName(apkFile.getName());
		this.manifestInfo = ManifestHelper.getInstance().getManifest(apkFile);
	}

	public File getApkFile() {
		return this.apkFile;
	}

	public String getFilename() {
		return this.filename;
	}

	public String getAppName() {
		return this.manifestInfo.getAppName();
	}

	public String getPkgName() {
		return this.manifestInfo.getPkgName();
	}

	public void setApkFile(File apkFile) {
		this.apkFile = apkFile;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}