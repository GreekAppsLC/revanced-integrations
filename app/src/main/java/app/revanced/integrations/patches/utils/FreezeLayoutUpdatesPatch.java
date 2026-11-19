package app.revanced.integrations.patches.utils;

import app.revanced.integrations.settings.SettingsEnum;

@SuppressWarnings("unused")
public class FreezeLayoutUpdatesPatch {
    private static final boolean enabled = SettingsEnum.FREEZE_LAYOUT_UPDATES.getBoolean();

    public static String getHotConfigGroup(String original) {
        if (enabled) {
            String savedValue = SettingsEnum.FROZEN_HOT_CONFIG_GROUP.getString();
            if (savedValue == null || savedValue.isEmpty()) {
                if (original != null && !original.isEmpty()) {
                    SettingsEnum.FROZEN_HOT_CONFIG_GROUP.saveValue(original);
                }
                return original;
            }
            return savedValue;
        }
        return original;
    }

    public static String getHotHashData(String original) {
        if (enabled) {
            String savedValue = SettingsEnum.FROZEN_HOT_HASH_DATA.getString();
            if (savedValue == null || savedValue.isEmpty()) {
                if (original != null && !original.isEmpty()) {
                    SettingsEnum.FROZEN_HOT_HASH_DATA.saveValue(original);
                }
                return original;
            }
            return savedValue;
        }
        return original;
    }

    public static String getColdConfigGroup(String original) {
        if (enabled) {
            String savedValue = SettingsEnum.FROZEN_COLD_CONFIG_GROUP.getString();
            if (savedValue == null || savedValue.isEmpty()) {
                if (original != null && !original.isEmpty()) {
                    SettingsEnum.FROZEN_COLD_CONFIG_GROUP.saveValue(original);
                }
                return original;
            }
            return savedValue;
        }
        return original;
    }

    public static String getColdHashData(String original) {
        if (enabled) {
            String savedValue = SettingsEnum.FROZEN_COLD_HASH_DATA.getString();
            if (savedValue == null || savedValue.isEmpty()) {
                if (original != null && !original.isEmpty()) {
                    SettingsEnum.FROZEN_COLD_HASH_DATA.saveValue(original);
                }
                return original;
            }
            return savedValue;
        }
        return original;
    }
}