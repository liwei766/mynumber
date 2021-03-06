/**
 * Copyright (C) 2017 OPTiM Corp. All Rights Reserved
 * システム名：
 * ソースファイル名：SpeechResult.java
 * 概要：
 *
 * 修正履歴：
 *   編集者		日付					概要
 *
 */
package cloud.optim.callcentersolution.core.modules.ffmpeg;

/**
 * 通話ログステータスの列挙型
 */
public enum Option {
	/** 出力時に既存の同名ファイルを警告無しに上書き */
	OVERWRITE("-y"),

	/** 入力ファイルのパス */
	INPUT("-i"),

	/** ログレベル */
	LOG_LEVEL("-loglevel"),

	/** 音声のビットレート  */
	AUDIO_BIT_RATE("-ab"),

	/** 音声コーデックを指定 */
	AUDIO_CODEC("-acodec"),

	/** 強制的に "fmt" で指定したフォーマットで出力 */
	FORMAT("-f"),

	/** 複数ファイルマージ用のフィルター */
	FILTER_COMPLEX("-filter_complex");

	private String value;

	Option (String value) {
		this.value = value;
	}

	public String getValue(){
		return this.value;
	}
}

