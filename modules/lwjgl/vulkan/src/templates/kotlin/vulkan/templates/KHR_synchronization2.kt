/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_synchronization2 = "KHRSynchronization2".nativeClassVK("KHR_synchronization2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SYNCHRONIZATION_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SYNCHRONIZATION_2_EXTENSION_NAME".."VK_KHR_synchronization2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR".."1000314000",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR".."1000314001",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR".."1000314002",
        "STRUCTURE_TYPE_DEPENDENCY_INFO_KHR".."1000314003",
        "STRUCTURE_TYPE_SUBMIT_INFO_2_KHR".."1000314004",
        "STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR".."1000314005",
        "STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR".."1000314006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR".."1000314007"
    )

    EnumConstant(
        "EVENT_CREATE_DEVICE_ONLY_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR".."1000314000",
        "IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR".."1000314001"
    )

    EnumConstant(
        "PIPELINE_STAGE_NONE_KHR".."0"
    )

    EnumConstant(
        "ACCESS_NONE_KHR".."0"
    )

    EnumConstantLong(
        "ACCESS_2_NONE_KHR".."0L",
        "ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR".enum(0x00000001L),
        "ACCESS_2_INDEX_READ_BIT_KHR".enum(0x00000002L),
        "ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR".enum(0x00000004L),
        "ACCESS_2_UNIFORM_READ_BIT_KHR".enum(0x00000008L),
        "ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR".enum(0x00000010L),
        "ACCESS_2_SHADER_READ_BIT_KHR".enum(0x00000020L),
        "ACCESS_2_SHADER_WRITE_BIT_KHR".enum(0x00000040L),
        "ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR".enum(0x00000080L),
        "ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR".enum(0x00000100L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR".enum(0x00000200L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR".enum(0x00000400L),
        "ACCESS_2_TRANSFER_READ_BIT_KHR".enum(0x00000800L),
        "ACCESS_2_TRANSFER_WRITE_BIT_KHR".enum(0x00001000L),
        "ACCESS_2_HOST_READ_BIT_KHR".enum(0x00002000L),
        "ACCESS_2_HOST_WRITE_BIT_KHR".enum(0x00004000L),
        "ACCESS_2_MEMORY_READ_BIT_KHR".enum(0x00008000L),
        "ACCESS_2_MEMORY_WRITE_BIT_KHR".enum(0x00010000L),
        "ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR".enum(0x100000000L),
        "ACCESS_2_SHADER_STORAGE_READ_BIT_KHR".enum(0x200000000L),
        "ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR".enum(0x400000000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_NONE_KHR".."0L",
        "PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR".enum(0x00000001L),
        "PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR".enum(0x00000002L),
        "PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR".enum(0x00000004L),
        "PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR".enum(0x00000008L),
        "PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR".enum(0x00000010L),
        "PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR".enum(0x00000020L),
        "PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR".enum(0x00000040L),
        "PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR".enum(0x00000080L),
        "PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR".enum(0x00000100L),
        "PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR".enum(0x00000200L),
        "PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR".enum(0x00000400L),
        "PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR".enum(0x00000800L),
        "PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR".enum(0x00001000L),
        "PIPELINE_STAGE_2_TRANSFER_BIT_KHR".enum(0x00001000L),
        "PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR".enum(0x00002000L),
        "PIPELINE_STAGE_2_HOST_BIT_KHR".enum(0x00004000L),
        "PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR".enum(0x00008000L),
        "PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR".enum(0x00010000L),
        "PIPELINE_STAGE_2_COPY_BIT_KHR".enum(0x100000000L),
        "PIPELINE_STAGE_2_RESOLVE_BIT_KHR".enum(0x200000000L),
        "PIPELINE_STAGE_2_BLIT_BIT_KHR".enum(0x400000000L),
        "PIPELINE_STAGE_2_CLEAR_BIT_KHR".enum(0x800000000L),
        "PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR".enum(0x1000000000L),
        "PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR".enum(0x2000000000L),
        "PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR".enum(0x4000000000L)
    )

    EnumConstant(
        "SUBMIT_PROTECTED_BIT_KHR".enum(0x00000001)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        "ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT".enum(0x02000000L),
        "ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT".enum(0x04000000L),
        "ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT".enum(0x08000000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00040000L)
    )

    EnumConstantLong(
        "ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT".enum(0x00100000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV".enum(0x00020000L)
    )

    EnumConstantLong(
        "ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV".enum(0x00020000L),
        "ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV".enum(0x00040000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_EXT".enum(0x00020000L)
    )

    EnumConstantLong(
        "ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT".enum(0x00020000L),
        "ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT".enum(0x00040000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00400000L)
    )

    EnumConstantLong(
        "ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR".enum(0x00800000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV".enum(0x00400000L)
    )

    EnumConstantLong(
        "ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV".enum(0x00800000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR".enum(0x02000000L)
    )

    EnumConstantLong(
        "ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR".enum(0x00200000L),
        "ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR".enum(0x00400000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR".enum(0x00200000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV".enum(0x00200000L),
        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV".enum(0x02000000L)
    )

    EnumConstantLong(
        "ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV".enum(0x00200000L),
        "ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV".enum(0x00400000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT".enum(0x00800000L)
    )

    EnumConstantLong(
        "ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        "ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT".enum(0x00080000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_TASK_SHADER_BIT_NV".enum(0x00080000L),
        "PIPELINE_STAGE_2_MESH_SHADER_BIT_NV".enum(0x00100000L)
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT".enum(0x00080000L),
        "PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT".enum(0x00100000L)
    )

    void(
        "CmdSetEvent2KHR",

        VkCommandBuffer("commandBuffer"),
        VkEvent("event"),
        VkDependencyInfo.const.p("pDependencyInfo")
    )

    void(
        "CmdResetEvent2KHR",

        VkCommandBuffer("commandBuffer"),
        VkEvent("event"),
        VkPipelineStageFlags2("stageMask")
    )

    void(
        "CmdWaitEvents2KHR",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pEvents", "pDependencyInfos")..uint32_t("eventCount"),
        VkEvent.const.p("pEvents"),
        VkDependencyInfo.const.p("pDependencyInfos")
    )

    void(
        "CmdPipelineBarrier2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDependencyInfo.const.p("pDependencyInfo")
    )

    void(
        "CmdWriteTimestamp2KHR",

        VkCommandBuffer("commandBuffer"),
        VkPipelineStageFlags2("stage"),
        VkQueryPool("queryPool"),
        uint32_t("query")
    )

    VkResult(
        "QueueSubmit2KHR",

        VkQueue("queue"),
        AutoSize("pSubmits")..uint32_t("submitCount"),
        nullable..VkSubmitInfo2.const.p("pSubmits"),
        VkFence("fence")
    )
}