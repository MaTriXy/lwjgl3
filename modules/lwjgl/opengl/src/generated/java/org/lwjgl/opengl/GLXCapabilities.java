/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

public final class GLXCapabilities {

    // GLX11
    public final long
        glXQueryExtensionsString,
        glXGetClientString,
        glXQueryServerString;

    // GLX12
    public final long
        glXGetCurrentDisplay;

    // GLX13
    public final long
        glXGetFBConfigs,
        glXChooseFBConfig,
        glXGetFBConfigAttrib,
        glXGetVisualFromFBConfig,
        glXCreateWindow,
        glXCreatePixmap,
        glXDestroyPixmap,
        glXCreatePbuffer,
        glXDestroyPbuffer,
        glXQueryDrawable,
        glXCreateNewContext,
        glXMakeContextCurrent,
        glXGetCurrentReadDrawable,
        glXQueryContext,
        glXSelectEvent,
        glXGetSelectedEvent;

    // GLX14
    public final long
        glXGetProcAddress;

    // GLX_AMD_gpu_association
    public final long
        glXBlitContextFramebufferAMD,
        glXCreateAssociatedContextAMD,
        glXCreateAssociatedContextAttribsAMD,
        glXDeleteAssociatedContextAMD,
        glXGetContextGPUIDAMD,
        glXGetCurrentAssociatedContextAMD,
        glXGetGPUIDsAMD,
        glXGetGPUInfoAMD,
        glXMakeAssociatedContextCurrentAMD;

    // GLX_ARB_create_context
    public final long
        glXCreateContextAttribsARB;

    // GLX_ARB_get_proc_address
    public final long
        glXGetProcAddressARB;

    // GLX_EXT_import_context
    public final long
        glXGetCurrentDisplayEXT,
        glXQueryContextInfoEXT,
        glXGetContextIDEXT,
        glXImportContextEXT,
        glXFreeContextEXT;

    // GLX_EXT_swap_control
    public final long
        glXSwapIntervalEXT;

    // GLX_EXT_texture_from_pixmap
    public final long
        glXBindTexImageEXT,
        glXReleaseTexImageEXT;

    // GLX_NV_copy_buffer
    public final long
        glXCopyBufferSubDataNV,
        glXNamedCopyBufferSubDataNV;

    // GLX_NV_copy_image
    public final long
        glXCopyImageSubDataNV;

    // GLX_NV_delay_before_swap
    public final long
        glXDelayBeforeSwapNV;

    // GLX_NV_swap_group
    public final long
        glXJoinSwapGroupNV,
        glXBindSwapBarrierNV,
        glXQuerySwapGroupNV,
        glXQueryMaxSwapGroupsNV,
        glXQueryFrameCountNV,
        glXResetFrameCountNV;

    // GLX_SGI_make_current_read
    public final long
        glXMakeCurrentReadSGI,
        glXGetCurrentReadDrawableSGI;

    // GLX_SGI_swap_control
    public final long
        glXSwapIntervalSGI;

    // GLX_SGI_video_sync
    public final long
        glXGetVideoSyncSGI,
        glXWaitVideoSyncSGI;

    // GLX_SGIX_fbconfig
    public final long
        glXGetFBConfigAttribSGIX,
        glXChooseFBConfigSGIX,
        glXCreateGLXPixmapWithConfigSGIX,
        glXCreateContextWithConfigSGIX,
        glXGetVisualFromFBConfigSGIX,
        glXGetFBConfigFromVisualSGIX;

    // GLX_SGIX_pbuffer
    public final long
        glXCreateGLXPbufferSGIX,
        glXDestroyGLXPbufferSGIX,
        glXQueryGLXPbufferSGIX,
        glXSelectEventSGIX,
        glXGetSelectedEventSGIX;

    // GLX_SGIX_swap_barrier
    public final long
        glXBindSwapBarrierSGIX,
        glXQueryMaxSwapBarriersSGIX;

    // GLX_SGIX_swap_group
    public final long
        glXJoinSwapGroupSGIX;

    /** When true, {@code GLX11} is supported. */
    public final boolean GLX11;
    /** When true, {@code GLX12} is supported. */
    public final boolean GLX12;
    /** When true, {@code GLX13} is supported. */
    public final boolean GLX13;
    /** When true, {@code GLX14} is supported. */
    public final boolean GLX14;
    /** When true, {@code GLX_AMD_gpu_association} is supported. */
    public final boolean GLX_AMD_gpu_association;
    /** When true, {@code GLX_ARB_context_flush_control} is supported. */
    public final boolean GLX_ARB_context_flush_control;
    /** When true, {@code GLX_ARB_create_context} is supported. */
    public final boolean GLX_ARB_create_context;
    /** When true, {@code GLX_ARB_create_context_no_error} is supported. */
    public final boolean GLX_ARB_create_context_no_error;
    /** When true, {@code GLX_ARB_create_context_profile} is supported. */
    public final boolean GLX_ARB_create_context_profile;
    /** When true, {@code GLX_ARB_create_context_robustness} is supported. */
    public final boolean GLX_ARB_create_context_robustness;
    /** When true, {@code GLX_ARB_fbconfig_float} is supported. */
    public final boolean GLX_ARB_fbconfig_float;
    /** When true, {@code GLX_ARB_framebuffer_sRGB} is supported. */
    public final boolean GLX_ARB_framebuffer_sRGB;
    /** When true, {@code GLX_ARB_get_proc_address} is supported. */
    public final boolean GLX_ARB_get_proc_address;
    /** When true, {@code GLX_ARB_multisample} is supported. */
    public final boolean GLX_ARB_multisample;
    /** When true, {@code GLX_ARB_robustness_application_isolation} is supported. */
    public final boolean GLX_ARB_robustness_application_isolation;
    /** When true, {@code GLX_ARB_robustness_share_group_isolation} is supported. */
    public final boolean GLX_ARB_robustness_share_group_isolation;
    /** When true, {@code GLX_ARB_vertex_buffer_object} is supported. */
    public final boolean GLX_ARB_vertex_buffer_object;
    /** When true, {@code GLX_EXT_buffer_age} is supported. */
    public final boolean GLX_EXT_buffer_age;
    /** When true, {@code GLX_EXT_context_priority} is supported. */
    public final boolean GLX_EXT_context_priority;
    /** When true, {@code GLX_EXT_create_context_es2_profile} is supported. */
    public final boolean GLX_EXT_create_context_es2_profile;
    /** When true, {@code GLX_EXT_create_context_es_profile} is supported. */
    public final boolean GLX_EXT_create_context_es_profile;
    /** When true, {@code GLX_EXT_fbconfig_packed_float} is supported. */
    public final boolean GLX_EXT_fbconfig_packed_float;
    /** When true, {@code GLX_EXT_framebuffer_sRGB} is supported. */
    public final boolean GLX_EXT_framebuffer_sRGB;
    /** When true, {@code GLX_EXT_get_drawable_type} is supported. */
    public final boolean GLX_EXT_get_drawable_type;
    /** When true, {@code GLX_EXT_import_context} is supported. */
    public final boolean GLX_EXT_import_context;
    /** When true, {@code GLX_EXT_no_config_context} is supported. */
    public final boolean GLX_EXT_no_config_context;
    /** When true, {@code GLX_EXT_stereo_tree} is supported. */
    public final boolean GLX_EXT_stereo_tree;
    /** When true, {@code GLX_EXT_swap_control} is supported. */
    public final boolean GLX_EXT_swap_control;
    /** When true, {@code GLX_EXT_swap_control_tear} is supported. */
    public final boolean GLX_EXT_swap_control_tear;
    /** When true, {@code GLX_EXT_texture_from_pixmap} is supported. */
    public final boolean GLX_EXT_texture_from_pixmap;
    /** When true, {@code GLX_EXT_visual_info} is supported. */
    public final boolean GLX_EXT_visual_info;
    /** When true, {@code GLX_EXT_visual_rating} is supported. */
    public final boolean GLX_EXT_visual_rating;
    /** When true, {@code GLX_INTEL_swap_event} is supported. */
    public final boolean GLX_INTEL_swap_event;
    /** When true, {@code GLX_NV_copy_buffer} is supported. */
    public final boolean GLX_NV_copy_buffer;
    /** When true, {@code GLX_NV_copy_image} is supported. */
    public final boolean GLX_NV_copy_image;
    /** When true, {@code GLX_NV_delay_before_swap} is supported. */
    public final boolean GLX_NV_delay_before_swap;
    /** When true, {@code GLX_NV_float_buffer} is supported. */
    public final boolean GLX_NV_float_buffer;
    /** When true, {@code GLX_NV_multigpu_context} is supported. */
    public final boolean GLX_NV_multigpu_context;
    /** When true, {@code GLX_NV_multisample_coverage} is supported. */
    public final boolean GLX_NV_multisample_coverage;
    /** When true, {@code GLX_NV_robustness_video_memory_purge} is supported. */
    public final boolean GLX_NV_robustness_video_memory_purge;
    /** When true, {@code GLX_NV_swap_group} is supported. */
    public final boolean GLX_NV_swap_group;
    /** When true, {@code GLX_SGI_make_current_read} is supported. */
    public final boolean GLX_SGI_make_current_read;
    /** When true, {@code GLX_SGI_swap_control} is supported. */
    public final boolean GLX_SGI_swap_control;
    /** When true, {@code GLX_SGI_video_sync} is supported. */
    public final boolean GLX_SGI_video_sync;
    /** When true, {@code GLX_SGIX_fbconfig} is supported. */
    public final boolean GLX_SGIX_fbconfig;
    /** When true, {@code GLX_SGIX_pbuffer} is supported. */
    public final boolean GLX_SGIX_pbuffer;
    /** When true, {@code GLX_SGIX_swap_barrier} is supported. */
    public final boolean GLX_SGIX_swap_barrier;
    /** When true, {@code GLX_SGIX_swap_group} is supported. */
    public final boolean GLX_SGIX_swap_group;

    GLXCapabilities(FunctionProvider provider, Set<String> ext) {
        long[] caps = new long[69];

        GLX11 = check_GLX11(provider, caps, ext);
        GLX12 = check_GLX12(provider, caps, ext);
        GLX13 = check_GLX13(provider, caps, ext);
        GLX14 = check_GLX14(provider, caps, ext);
        GLX_AMD_gpu_association = check_GLX_AMD_gpu_association(provider, caps, ext);
        GLX_ARB_context_flush_control = ext.contains("GLX_ARB_context_flush_control");
        GLX_ARB_create_context = check_GLX_ARB_create_context(provider, caps, ext);
        GLX_ARB_create_context_no_error = ext.contains("GLX_ARB_create_context_no_error");
        GLX_ARB_create_context_profile = ext.contains("GLX_ARB_create_context_profile");
        GLX_ARB_create_context_robustness = ext.contains("GLX_ARB_create_context_robustness");
        GLX_ARB_fbconfig_float = ext.contains("GLX_ARB_fbconfig_float");
        GLX_ARB_framebuffer_sRGB = ext.contains("GLX_ARB_framebuffer_sRGB");
        GLX_ARB_get_proc_address = check_GLX_ARB_get_proc_address(provider, caps, ext);
        GLX_ARB_multisample = ext.contains("GLX_ARB_multisample");
        GLX_ARB_robustness_application_isolation = ext.contains("GLX_ARB_robustness_application_isolation");
        GLX_ARB_robustness_share_group_isolation = ext.contains("GLX_ARB_robustness_share_group_isolation");
        GLX_ARB_vertex_buffer_object = ext.contains("GLX_ARB_vertex_buffer_object");
        GLX_EXT_buffer_age = ext.contains("GLX_EXT_buffer_age");
        GLX_EXT_context_priority = ext.contains("GLX_EXT_context_priority");
        GLX_EXT_create_context_es2_profile = ext.contains("GLX_EXT_create_context_es2_profile");
        GLX_EXT_create_context_es_profile = ext.contains("GLX_EXT_create_context_es_profile");
        GLX_EXT_fbconfig_packed_float = ext.contains("GLX_EXT_fbconfig_packed_float");
        GLX_EXT_framebuffer_sRGB = ext.contains("GLX_EXT_framebuffer_sRGB");
        GLX_EXT_get_drawable_type = ext.contains("GLX_EXT_get_drawable_type");
        GLX_EXT_import_context = check_GLX_EXT_import_context(provider, caps, ext);
        GLX_EXT_no_config_context = ext.contains("GLX_EXT_no_config_context");
        GLX_EXT_stereo_tree = ext.contains("GLX_EXT_stereo_tree");
        GLX_EXT_swap_control = check_GLX_EXT_swap_control(provider, caps, ext);
        GLX_EXT_swap_control_tear = ext.contains("GLX_EXT_swap_control_tear");
        GLX_EXT_texture_from_pixmap = check_GLX_EXT_texture_from_pixmap(provider, caps, ext);
        GLX_EXT_visual_info = ext.contains("GLX_EXT_visual_info");
        GLX_EXT_visual_rating = ext.contains("GLX_EXT_visual_rating");
        GLX_INTEL_swap_event = ext.contains("GLX_INTEL_swap_event");
        GLX_NV_copy_buffer = check_GLX_NV_copy_buffer(provider, caps, ext);
        GLX_NV_copy_image = check_GLX_NV_copy_image(provider, caps, ext);
        GLX_NV_delay_before_swap = check_GLX_NV_delay_before_swap(provider, caps, ext);
        GLX_NV_float_buffer = ext.contains("GLX_NV_float_buffer");
        GLX_NV_multigpu_context = ext.contains("GLX_NV_multigpu_context");
        GLX_NV_multisample_coverage = ext.contains("GLX_NV_multisample_coverage");
        GLX_NV_robustness_video_memory_purge = ext.contains("GLX_NV_robustness_video_memory_purge");
        GLX_NV_swap_group = check_GLX_NV_swap_group(provider, caps, ext);
        GLX_SGI_make_current_read = check_GLX_SGI_make_current_read(provider, caps, ext);
        GLX_SGI_swap_control = check_GLX_SGI_swap_control(provider, caps, ext);
        GLX_SGI_video_sync = check_GLX_SGI_video_sync(provider, caps, ext);
        GLX_SGIX_fbconfig = check_GLX_SGIX_fbconfig(provider, caps, ext);
        GLX_SGIX_pbuffer = check_GLX_SGIX_pbuffer(provider, caps, ext);
        GLX_SGIX_swap_barrier = check_GLX_SGIX_swap_barrier(provider, caps, ext);
        GLX_SGIX_swap_group = check_GLX_SGIX_swap_group(provider, caps, ext);

        glXQueryExtensionsString = caps[0];
        glXGetClientString = caps[1];
        glXQueryServerString = caps[2];
        glXGetCurrentDisplay = caps[3];
        glXGetFBConfigs = caps[4];
        glXChooseFBConfig = caps[5];
        glXGetFBConfigAttrib = caps[6];
        glXGetVisualFromFBConfig = caps[7];
        glXCreateWindow = caps[8];
        glXCreatePixmap = caps[9];
        glXDestroyPixmap = caps[10];
        glXCreatePbuffer = caps[11];
        glXDestroyPbuffer = caps[12];
        glXQueryDrawable = caps[13];
        glXCreateNewContext = caps[14];
        glXMakeContextCurrent = caps[15];
        glXGetCurrentReadDrawable = caps[16];
        glXQueryContext = caps[17];
        glXSelectEvent = caps[18];
        glXGetSelectedEvent = caps[19];
        glXGetProcAddress = caps[20];
        glXBlitContextFramebufferAMD = caps[21];
        glXCreateAssociatedContextAMD = caps[22];
        glXCreateAssociatedContextAttribsAMD = caps[23];
        glXDeleteAssociatedContextAMD = caps[24];
        glXGetContextGPUIDAMD = caps[25];
        glXGetCurrentAssociatedContextAMD = caps[26];
        glXGetGPUIDsAMD = caps[27];
        glXGetGPUInfoAMD = caps[28];
        glXMakeAssociatedContextCurrentAMD = caps[29];
        glXCreateContextAttribsARB = caps[30];
        glXGetProcAddressARB = caps[31];
        glXGetCurrentDisplayEXT = caps[32];
        glXQueryContextInfoEXT = caps[33];
        glXGetContextIDEXT = caps[34];
        glXImportContextEXT = caps[35];
        glXFreeContextEXT = caps[36];
        glXSwapIntervalEXT = caps[37];
        glXBindTexImageEXT = caps[38];
        glXReleaseTexImageEXT = caps[39];
        glXCopyBufferSubDataNV = caps[40];
        glXNamedCopyBufferSubDataNV = caps[41];
        glXCopyImageSubDataNV = caps[42];
        glXDelayBeforeSwapNV = caps[43];
        glXJoinSwapGroupNV = caps[44];
        glXBindSwapBarrierNV = caps[45];
        glXQuerySwapGroupNV = caps[46];
        glXQueryMaxSwapGroupsNV = caps[47];
        glXQueryFrameCountNV = caps[48];
        glXResetFrameCountNV = caps[49];
        glXMakeCurrentReadSGI = caps[50];
        glXGetCurrentReadDrawableSGI = caps[51];
        glXSwapIntervalSGI = caps[52];
        glXGetVideoSyncSGI = caps[53];
        glXWaitVideoSyncSGI = caps[54];
        glXGetFBConfigAttribSGIX = caps[55];
        glXChooseFBConfigSGIX = caps[56];
        glXCreateGLXPixmapWithConfigSGIX = caps[57];
        glXCreateContextWithConfigSGIX = caps[58];
        glXGetVisualFromFBConfigSGIX = caps[59];
        glXGetFBConfigFromVisualSGIX = caps[60];
        glXCreateGLXPbufferSGIX = caps[61];
        glXDestroyGLXPbufferSGIX = caps[62];
        glXQueryGLXPbufferSGIX = caps[63];
        glXSelectEventSGIX = caps[64];
        glXGetSelectedEventSGIX = caps[65];
        glXBindSwapBarrierSGIX = caps[66];
        glXQueryMaxSwapBarriersSGIX = caps[67];
        glXJoinSwapGroupSGIX = caps[68];
    }

    private static boolean check_GLX11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2
        },
            "glXQueryExtensionsString", "glXGetClientString", "glXQueryServerString"
        ) || reportMissing("GLX", "GLX11");
    }

    private static boolean check_GLX12(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX12")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            3
        },
            "glXGetCurrentDisplay"
        ) || reportMissing("GLX", "GLX12");
    }

    private static boolean check_GLX13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX13")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
        },
            "glXGetFBConfigs", "glXChooseFBConfig", "glXGetFBConfigAttrib", "glXGetVisualFromFBConfig", "glXCreateWindow", "glXCreatePixmap", 
            "glXDestroyPixmap", "glXCreatePbuffer", "glXDestroyPbuffer", "glXQueryDrawable", "glXCreateNewContext", "glXMakeContextCurrent", 
            "glXGetCurrentReadDrawable", "glXQueryContext", "glXSelectEvent", "glXGetSelectedEvent"
        ) || reportMissing("GLX", "GLX13");
    }

    private static boolean check_GLX14(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX14")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            20
        },
            "glXGetProcAddress"
        ) || reportMissing("GLX", "GLX14");
    }

    private static boolean check_GLX_AMD_gpu_association(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_AMD_gpu_association")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            21, 22, 23, 24, 25, 26, 27, 28, 29
        },
            "glXBlitContextFramebufferAMD", "glXCreateAssociatedContextAMD", "glXCreateAssociatedContextAttribsAMD", "glXDeleteAssociatedContextAMD", 
            "glXGetContextGPUIDAMD", "glXGetCurrentAssociatedContextAMD", "glXGetGPUIDsAMD", "glXGetGPUInfoAMD", "glXMakeAssociatedContextCurrentAMD"
        ) || reportMissing("GLX", "GLX_AMD_gpu_association");
    }

    private static boolean check_GLX_ARB_create_context(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_ARB_create_context")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            30
        },
            "glXCreateContextAttribsARB"
        ) || reportMissing("GLX", "GLX_ARB_create_context");
    }

    private static boolean check_GLX_ARB_get_proc_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_ARB_get_proc_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            31
        },
            "glXGetProcAddressARB"
        ) || reportMissing("GLX", "GLX_ARB_get_proc_address");
    }

    private static boolean check_GLX_EXT_import_context(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_EXT_import_context")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            32, 33, 34, 35, 36
        },
            "glXGetCurrentDisplayEXT", "glXQueryContextInfoEXT", "glXGetContextIDEXT", "glXImportContextEXT", "glXFreeContextEXT"
        ) || reportMissing("GLX", "GLX_EXT_import_context");
    }

    private static boolean check_GLX_EXT_swap_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_EXT_swap_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            37
        },
            "glXSwapIntervalEXT"
        ) || reportMissing("GLX", "GLX_EXT_swap_control");
    }

    private static boolean check_GLX_EXT_texture_from_pixmap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_EXT_texture_from_pixmap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            38, 39
        },
            "glXBindTexImageEXT", "glXReleaseTexImageEXT"
        ) || reportMissing("GLX", "GLX_EXT_texture_from_pixmap");
    }

    private static boolean check_GLX_NV_copy_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_NV_copy_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            40, 41
        },
            "glXCopyBufferSubDataNV", "glXNamedCopyBufferSubDataNV"
        ) || reportMissing("GLX", "GLX_NV_copy_buffer");
    }

    private static boolean check_GLX_NV_copy_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_NV_copy_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            42
        },
            "glXCopyImageSubDataNV"
        ) || reportMissing("GLX", "GLX_NV_copy_image");
    }

    private static boolean check_GLX_NV_delay_before_swap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_NV_delay_before_swap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            43
        },
            "glXDelayBeforeSwapNV"
        ) || reportMissing("GLX", "GLX_NV_delay_before_swap");
    }

    private static boolean check_GLX_NV_swap_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_NV_swap_group")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            44, 45, 46, 47, 48, 49
        },
            "glXJoinSwapGroupNV", "glXBindSwapBarrierNV", "glXQuerySwapGroupNV", "glXQueryMaxSwapGroupsNV", "glXQueryFrameCountNV", "glXResetFrameCountNV"
        ) || reportMissing("GLX", "GLX_NV_swap_group");
    }

    private static boolean check_GLX_SGI_make_current_read(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGI_make_current_read")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            50, 51
        },
            "glXMakeCurrentReadSGI", "glXGetCurrentReadDrawableSGI"
        ) || reportMissing("GLX", "GLX_SGI_make_current_read");
    }

    private static boolean check_GLX_SGI_swap_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGI_swap_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52
        },
            "glXSwapIntervalSGI"
        ) || reportMissing("GLX", "GLX_SGI_swap_control");
    }

    private static boolean check_GLX_SGI_video_sync(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGI_video_sync")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53, 54
        },
            "glXGetVideoSyncSGI", "glXWaitVideoSyncSGI"
        ) || reportMissing("GLX", "GLX_SGI_video_sync");
    }

    private static boolean check_GLX_SGIX_fbconfig(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGIX_fbconfig")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            55, 56, 57, 58, 59, 60
        },
            "glXGetFBConfigAttribSGIX", "glXChooseFBConfigSGIX", "glXCreateGLXPixmapWithConfigSGIX", "glXCreateContextWithConfigSGIX", 
            "glXGetVisualFromFBConfigSGIX", "glXGetFBConfigFromVisualSGIX"
        ) || reportMissing("GLX", "GLX_SGIX_fbconfig");
    }

    private static boolean check_GLX_SGIX_pbuffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGIX_pbuffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            61, 62, 63, 64, 65
        },
            "glXCreateGLXPbufferSGIX", "glXDestroyGLXPbufferSGIX", "glXQueryGLXPbufferSGIX", "glXSelectEventSGIX", "glXGetSelectedEventSGIX"
        ) || reportMissing("GLX", "GLX_SGIX_pbuffer");
    }

    private static boolean check_GLX_SGIX_swap_barrier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGIX_swap_barrier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            66, 67
        },
            "glXBindSwapBarrierSGIX", "glXQueryMaxSwapBarriersSGIX"
        ) || reportMissing("GLX", "GLX_SGIX_swap_barrier");
    }

    private static boolean check_GLX_SGIX_swap_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("GLX_SGIX_swap_group")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            68
        },
            "glXJoinSwapGroupSGIX"
        ) || reportMissing("GLX", "GLX_SGIX_swap_group");
    }

}
