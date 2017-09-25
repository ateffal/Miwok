package com.example.android.miwok;

/**
 * Created by TEFFAL AMINE on 12/06/2017.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;



    /** Image ID for the word */
    private int mImageRessourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Image ID for the word */
    private int mAudioRessourceID = NO_AUDIO_PROVIDED;

    private static final int NO_AUDIO_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageRessourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageRessourceID = mImageRessourceID;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageRessourceID, int mAudioRessourseID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageRessourceID = mImageRessourceID;
        this.mAudioRessourceID = mAudioRessourseID;
    }





    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmAudioRessourceID() {
        return mAudioRessourceID;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {

        return mMiwokTranslation;

    }

    public int getImageRessourceID() {
        return mImageRessourceID;
    }

    public boolean hasImage() {
        return mImageRessourceID!=NO_IMAGE_PROVIDED;
    }

    public boolean hasAudio() {
        return mAudioRessourceID!=NO_AUDIO_PROVIDED;
    }

}
