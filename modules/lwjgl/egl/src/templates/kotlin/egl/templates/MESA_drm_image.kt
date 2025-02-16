/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val MESA_drm_image = "MESADRMImage".nativeClassEGL("MESA_drm_image", postfix = MESA) {
    IntConstant(
        "DRM_BUFFER_FORMAT_MESA"..0x31D0,
        "DRM_BUFFER_USE_MESA"..0x31D1,
        "DRM_BUFFER_FORMAT_ARGB32_MESA"..0x31D2,
        "DRM_BUFFER_MESA"..0x31D3,
        "DRM_BUFFER_STRIDE_MESA"..0x31D4,
        "DRM_BUFFER_USE_SCANOUT_MESA"..0x00000001,
        "DRM_BUFFER_USE_SHARE_MESA"..0x00000002
    )

    EGLImageKHR(
        "CreateDRMImageMESA",

        EGLDisplay("dpy"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )

    EGLBoolean(
        "ExportDRMImageMESA",

        EGLDisplay("dpy"),
        EGLImageKHR("image"),
        nullable..Check(1)..EGLint.p("name"),
        nullable..Check(1)..EGLint.p("handle"),
        nullable..Check(1)..EGLint.p("stride")
    )
}