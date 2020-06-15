package cn.lime.jtool.core.util;

/**
 * 字符串工具类
 */
public class StringUtils {

    public static final String SPACE = " ";
    public static final String EMPTY = "";
    public static final String LF = "\n";
    public static final String CR = "\r";

    /**
     * 判断字符串是否为空或者null
     * <pre>
     * StringUtil.isEmpty(null)      = true
     * StringUtil.isEmpty("")        = true
     * StringUtil.isEmpty(" ")       = false
     * StringUtil.isEmpty("jtool")     = false
     * StringUtil.isEmpty("  jtool  ") = false
     * </pre>
     * @param cs 待检测字符串
     * @return 是否为空
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 判断字符串是否不为空或者null
     * <pre>
     * StringUtil.isNotEmpty(null)      = false
     * StringUtil.isNotEmpty("")        = false
     * StringUtil.isNotEmpty(" ")       = true
     * StringUtil.isNotEmpty("jtool")     = true
     * StringUtil.isNotEmpty("  jtool  ") = true
     * </pre>
     * @param cs 待检测字符串
     * @return 是否不为空
     */
    public static boolean isNotEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }

    /**
     * 判断字符串是否为空白或者null
     * <pre>
     * StringUtil.isBlank(null)      = true
     * StringUtil.isBlank("")        = true
     * StringUtil.isBlank(" ")       = true
     * StringUtil.isBlank("jtool")     = false
     * StringUtil.isBlank("  jtool  ") = false
     * </pre>
     * @param cs 待检测字符串
     * @return 是否为空白
     */
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串是否不为空白或者null
     * <pre>
     * StringUtil.isBlank(null)      = false
     * StringUtil.isBlank("")        = false
     * StringUtil.isBlank(" ")       = false
     * StringUtil.isBlank("jtool")     = true
     * StringUtil.isBlank("  jtool  ") = true
     * </pre>
     * @param cs 待检测字符串
     * @return 是否不为空白
     */
    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }
}
