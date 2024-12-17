/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance2 = "KHRMaintenance2".nativeClassVK("KHR_maintenance2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_2_EXTENSION_NAME".."VK_KHR_maintenance2"
    )

    IntConstant(
        "KHR_MAINTENANCE2_SPEC_VERSION".."VK_KHR_MAINTENANCE_2_SPEC_VERSION"
    )

    StringConstant(
        "KHR_MAINTENANCE2_EXTENSION_NAME".expr("VK_KHR_MAINTENANCE_2_EXTENSION_NAME")
    )

    EnumConstant(
        "IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR".enum(0x00000080),
        "IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR".enum(0x00000100)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR".."1000117000",
        "STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR".."1000117001",
        "STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR".."1000117002",
        "STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR".."1000117003"
    )

    EnumConstant(
        "IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR".."1000117000",
        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR".."1000117001"
    )

    EnumConstant(
        "POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR".."0",
        "POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR".."1"
    )

    EnumConstant(
        "TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR".."0",
        "TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR".."1"
    )
}